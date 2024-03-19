package cn.scikth.service.impl;

import cn.scikth.entity.LogInstruct;
import cn.scikth.mapper.LogInstructMapper;
import cn.scikth.service.ILogInstructService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 指令日志表 服务实现类
 * </p>
 *
 * @author t
 * @since 2024-03-19
 */
@Service
public class LogInstructServiceImpl extends ServiceImpl<LogInstructMapper, LogInstruct> implements ILogInstructService {

}
