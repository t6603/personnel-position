package cn.scikth.service.impl;

import cn.scikth.entity.LogLogin;
import cn.scikth.mapper.LogLoginMapper;
import cn.scikth.service.ILogLoginService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录日志表 服务实现类
 * </p>
 *
 * @author t
 * @since 2024-03-19
 */
@Service
public class LogLoginServiceImpl extends ServiceImpl<LogLoginMapper, LogLogin> implements ILogLoginService {

}
