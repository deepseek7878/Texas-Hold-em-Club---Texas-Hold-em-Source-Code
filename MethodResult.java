package dzdc.core.dto;

public class MethodResult<T> {
    private boolean result;
    private String errMsg;
    private T data;

    public MethodResult(boolean result, String errMsg) {
        this.result = result;
        this.errMsg = errMsg;
    }

    public MethodResult(boolean result, String errMsg, T data) {
        this.result = result;
        this.errMsg = errMsg;
        this.data = data;
    }

    public MethodResult() {

    }

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
