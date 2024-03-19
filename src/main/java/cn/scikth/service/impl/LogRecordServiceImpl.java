package cn.scikth.service.impl;

import cn.scikth.entity.LogRecord;
import cn.scikth.mapper.LogRecordMapper;
import cn.scikth.service.ILogRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志表 服务实现类
 * </p>
 *
 * @author t
 * @since 2024-03-19
 */
@Service
public class LogRecordServiceImpl extends ServiceImpl<LogRecordMapper, LogRecord> implements ILogRecordService {

}
