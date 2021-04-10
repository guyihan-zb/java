// 非空效验【后端原则：永远不要相信前端】
        if(num1!=null && num2!=null &&
            !num1.equals("") && !num2.equals("")){
            // 2.进行相应的业务处理（进行相加操作）
            sum = Integer.parseInt(num1) +
                    Integer.parseInt(num2);
            state = 200;
        }else{
            // 非法请求，参数传递不全
            msg = "非法请求，参数传递不全!";
        }