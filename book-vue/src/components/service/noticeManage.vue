<template>
  <div>
    <el-card class="box-card" shadow="never">
      <el-button size="mini" @click="add">添加</el-button>
    </el-card>
    <el-table :data="tableData" border style="width: 100%;margin-top: 20px;"
      :header-cell-style="{background: 'rgb(242, 243, 244)',color:'#515a6e'}">
      <el-table-column fixed prop="id" label="ID" v-if="false">
      </el-table-column>
      <el-table-column prop="title" label="公告标题">
      </el-table-column>
      <el-table-column :show-overflow-tooltip="true" prop="content" label="公告内容">
      </el-table-column>
      <el-table-column :formatter="dateFormat" prop="createtime" label="创建时间">
      </el-table-column>
      <el-table-column fixed="right" label="操作">
        <template slot-scope="scope">
          <el-button size="mini" @click="look(scope.row)">查看</el-button>
          <el-button size="mini" @click="update(scope.row)">编辑</el-button>
          <el-button type="danger" size="mini" @click="del(scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    <div style="margin-top:20px;float:right;">
      <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange" :page-sizes="[5, 10, 15, 20]"
        :page-size="pageSize" :current-page="currentPage" background layout="total, sizes, prev, pager, next, jumper"
        :total="total">
      </el-pagination>
    </div>
    <div>
      <el-dialog id="noticeManage" :title="title" :visible.sync="dialogFormVisible">
        <el-form :rules="rules" :model="notice" ref="notice">
          <el-form-item style="display:none;" label="id" label-width="100px" prop="id">
            <el-input v-model="notice.id"></el-input>
          </el-form-item>
          <el-form-item label="公告标题：" label-width="100px" prop="title">
            <el-input :disabled="dialogInputButtonVisible" v-model="notice.title" clearable></el-input>
          </el-form-item>
          <el-form-item label="公告内容：" label-width="100px" prop="content">
            <el-input type="textarea" :rows="5" :disabled="dialogInputButtonVisible" v-model="notice.content"
              clearable></el-input>
          </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
          <el-button @click="dialogFormVisible = false" :disabled="dialogInputButtonVisible">取 消</el-button>
          <el-button type="primary" @click="submit('notice')" :disabled="dialogInputButtonVisible">确 定</el-button>
        </div>
      </el-dialog>
    </div>
  </div>
</template>

<script>
import formatDate from '../../utils/dateUtil.js';
export default {
  methods: {
    
  },
  mounted() {
    this.getDataPage(this.currentPage, this.pageSize);
  },
  data() {
    return {
      notice: {
        id: "",
        title: "",
        content: "",
        createtime: ""
      },
      title: "",
      dialogInputButtonVisible: false,
      dialogFormVisible: false,
      total: 0,
      pageSize: 5,
      currentPage: 1,
      tableData: [],
      rules: {
        title: [
          { required: true, message: '公告标题不能为空', trigger: 'blur' },
          { max: 100, message: "公告标题长度不能超过100个字符", trigger: "blur" }
        ],
        content: [
          { required: true, message: '公告内容不能为空', trigger: 'blur' },
          { max: 2000, message: "公告内容长度不能超过2000个字符", trigger: "blur" }
        ]
      }
    }
  }
}
</script>
<style>

</style>