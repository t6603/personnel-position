package cn.scikth.service.impl;

import cn.scikth.entity.LogAlarm;
import cn.scikth.mapper.LogAlarmMapper;
import cn.scikth.service.ILogAlarmService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 报警记录表 服务实现类
 * </p>
 *
 * @author t
 * @since 2024-03-19
 */
@Service
public class LogAlarmServiceImpl extends ServiceImpl<LogAlarmMapper, LogAlarm> implements ILogAlarmService {

}
