<template>
    <div style="float:left;">
        <div style="float:left;width:700px;">
            <el-card class="box-card">
                <div class="console">
                    <el-collapse v-model="activeNames">
                        <el-collapse-item title="项目介绍" name="1">
                            扶摇图书管理系统是一套基于SpringBoot+Vue+ElementUI的前后端分离Web系统。<br>
                            同时采用echarts图形组件，非常适合作为毕业设计或开发学习。
                        </el-collapse-item>
                        <el-collapse-item title="使用技术" name="2">
                            <div>
                                <el-tag>SpringBoot</el-tag>
                                <el-tag>Vue2.0</el-tag>
                                <el-tag>Elementui</el-tag>
                                <el-tag>jwt</el-tag>
                                <el-tag>MyBatis</el-tag>
                                <el-tag>Mysql</el-tag>
                                <el-tag>echarts</el-tag>
                                <el-tag>easyexcel</el-tag>
                            </div>
                        </el-collapse-item>
                        <el-collapse-item title="功能介绍" name="3">
                            <div>权限管理：包含菜单管理、用户管理、角色管理、部门管理、用户权限分配。</div>
                            
                        </el-collapse-item>
                    </el-collapse>
                </div>
            </el-card>
        </div>
        <div style="float:left;width:550px;margin-left: 20px;">
            <el-card class="box-card">
                <div class="console">
                    <el-collapse v-model="person">
                        <el-collapse-item title="开发者信息" name="5">
                            由于项目咨询的人过多,实在分身乏术，因此决定将提供有偿咨询服务。如果您在安装或者开发学习中遇到困难，可以联系本人提供有偿服务。
                            <div>
                                <el-image style="width:100px;height:100px;" src="../../../static/images/mine.jpg">
                                </el-image>
                            </div>
                            服务类目如下：<br>

                            1.如果项目在运行过程中出现问题无法处理，提供技术服务，帮你查找问题，保证项目运行。<br>

                            2.如果你需要对项目进行一些修改，或者开发一些新功能，提供开发服务。<br>

                            3.如果你需要开源项目的论文，提供论文代写，包查重。<br>

                            <b style="color:blue;">4.也接定制开发和论文哦，价格便宜。</b><br>
                        </el-collapse-item>
                        <el-collapse-item title="个人公众号" name="7">
                            如果本项目不适合你，没关系。关注本人公众号，里面还有更多开源项目等着你。
                            <div>
                                <el-image style="width:100px;height:100px;" src="../../../static/images/gongzhonghao.jpg">
                                </el-image>
                            </div>
                        </el-collapse-item>
                    </el-collapse>
                </div>
            </el-card>
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {
            activeNames: ['1', '2', '3'],
            person: ['5', '6', '7']
        };
    },
    methods: {
    }
}
</script>
<style>
.console .el-collapse-item__header {
    font-size: 16px;
    font-weight: bold;
}

.console .el-collapse-item__content {
    font-size: 15px;
    line-height: 35px;
}
</style>