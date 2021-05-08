$(document).ready(function() {
        $('#StudentTableContainer').jtable({
                title : 'Students List',
                actions : {
                        listAction : 'StudentController?action=list',
                        createAction : 'StudentController?action=create',
                        updateAction : 'StudentController?action=update',
                        deleteAction : 'StudentController?action=delete'
                },
                fields : {
                        studentId : {
                                title : 'Student Id',
                                width : '30%',
                                key : true,
                                list : true,
                                edit : false,
                                create : true
                        },
                        name : {
                                title : 'Name',
                                width : '30%',
                                edit : true
                        },
                        department : {
                                title : 'Department',
                                width : '30%',
                                edit : true
                        },
                        emailId : {
                                title : 'Email',
                                width : '20%',
                                edit : true
                        }
                }
        });
        $('#StudentTableContainer').jtable('load');
});