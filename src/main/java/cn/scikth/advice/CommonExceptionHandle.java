package cn.scikth.advice;




import cn.scikth.exception.MyException;
import cn.scikth.utils.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CommonExceptionHandle {
    @ExceptionHandler(NullPointerException.class)
    public Result nullPointerException(NullPointerException e){
        e.printStackTrace();//异常堆栈信息
        return new Result("555","空指针异常");
    }


    @ExceptionHandler(MyException.class)
    public Result MyExceptionHandler(MyException ex){
        ex.printStackTrace();//异常堆栈信息
        return new Result(ex.getCode(),ex.getMessage());
    }



    @ExceptionHandler(Exception.class)
    public Result nullPointerException(Exception e){
        e.printStackTrace();//异常堆栈信息
        return new Result("555","未知错误");
    }
}
