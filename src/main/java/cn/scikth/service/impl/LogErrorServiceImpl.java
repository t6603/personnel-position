package cn.scikth.service.impl;

import cn.scikth.entity.LogError;
import cn.scikth.mapper.LogErrorMapper;
import cn.scikth.service.ILogErrorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 异常日志表 服务实现类
 * </p>
 *
 * @author t
 * @since 2024-03-19
 */
@Service
public class LogErrorServiceImpl extends ServiceImpl<LogErrorMapper, LogError> implements ILogErrorService {

}
