package cn.scikth.exception;

/**
 * 自定义异常
 */
public class MyException extends RuntimeException {
    private String code;

    public MyException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
