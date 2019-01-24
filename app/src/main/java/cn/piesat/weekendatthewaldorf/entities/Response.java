package cn.piesat.weekendatthewaldorf.entities;

/**
 * Created by arvinljw on 2018/10/31 14:58
 * Function：
 * Desc：
 */
public class Response<T> {
    private int status;
    public String msg;
    private T data;

    public int getErrorCode() {
        return status;
    }

    public void setErrorCode(int errorCode) {
        this.status = errorCode;
    }

    public String getErrorMsg() {
        return msg;
    }

    public void setErrorMsg(String errorMsg) {
        this.msg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return status == 1;
    }
}
