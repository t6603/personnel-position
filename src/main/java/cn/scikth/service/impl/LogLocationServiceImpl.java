package cn.scikth.service.impl;

import cn.scikth.entity.LogLocation;
import cn.scikth.mapper.LogLocationMapper;
import cn.scikth.service.ILogLocationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 位置记录表 服务实现类
 * </p>
 *
 * @author t
 * @since 2024-03-19
 */
@Service
public class LogLocationServiceImpl extends ServiceImpl<LogLocationMapper, LogLocation> implements ILogLocationService {

}
