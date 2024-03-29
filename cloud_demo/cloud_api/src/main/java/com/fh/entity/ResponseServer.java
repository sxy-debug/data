package com.fh.entity;

import java.io.Serializable;

/**
 * @author shangfeng
 * @Title: ResponseServer
 * @Package com.fh.commons.response
 * @Description: ${todo}
 * @date 2019/7/2  10:43
 */
public class ResponseServer implements Serializable {

    private Integer code;

    private String msg;

    private Object data;


    private ResponseServer(){

    }
    private ResponseServer(Integer code,String msg){
        this.code=code;
        this.msg=msg;

    }
    private ResponseServer(Integer code,String msg,Object data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    /**
     * 返回默认的 成功状态 200
     * @return
     */
    public static  ResponseServer success(){
        return new ResponseServer(ServerEnum.SUCCESS.getCode(),ServerEnum.SUCCESS.getMsg());
    }

    /**
     * 返回默认的带数据 成功状态 200
     * @param data
     * @return
     */
    public static  ResponseServer success(Object data){
        return new ResponseServer(ServerEnum.SUCCESS.getCode(),ServerEnum.SUCCESS.getMsg(),data);
    }

    /**
     * 其他特殊类型的成功状态，
     * @param serverEnum
     * @return
     */
    public static  ResponseServer success(ServerEnum serverEnum){
        return new ResponseServer(serverEnum.getCode(),serverEnum.getMsg());
    }

    /**
     * 带返回数据的其他特殊类型的成功状态
     * @param serverEnum
     * @param data
     * @return
     */
    public static  ResponseServer success(ServerEnum serverEnum,Object data){
        return new ResponseServer(serverEnum.getCode(),serverEnum.getMsg(),data);
    }


///////失败

    /**
+     * @return
     */
    public static  ResponseServer error(){
        return new ResponseServer(ServerEnum.ERROR.getCode(),ServerEnum.ERROR.getMsg());
    }

    /**
     * @return
     */
    public static  ResponseServer error(Integer code,String message){
        return new ResponseServer(code,message);
    }

    /**
     * 返回默认的带数据 失败状态 500
     * @param data
     * @return
     */
    public static  ResponseServer error(Object data){
        return new ResponseServer(ServerEnum.ERROR.getCode(),ServerEnum.ERROR.getMsg(),data);
    }

    /**
     * 其他特殊类型的失败状态，
     * @param serverEnum
     * @return
     */
    public static  ResponseServer error(ServerEnum serverEnum){
        return new ResponseServer(serverEnum.getCode(),serverEnum.getMsg());
    }

    /**
     * 带返回数据的其他特殊类型的失败状态
     * @param serverEnum
     * @param data
     * @return
     */
    public static  ResponseServer error(ServerEnum serverEnum,Object data){
        return new ResponseServer(serverEnum.getCode(),serverEnum.getMsg(),data);
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
