package com.chenpihui;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.OracleTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 功能描述:
 * @author ZMT
 * @date  2019-03-31 17:21
 **/

public class MpGenerator {
    final static String  dirPath = "D:\\CHENPIHUI\\workspace\\admin\\0405\\chenpihui\\src\\main\\java\\";

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        // 选择 freemarker 引擎，默认 Veloctiy
        //mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(dirPath);
        gc.setAuthor("ZMT");
        gc.setFileOverride(true); //是否覆盖
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
         gc.setMapperName("%sDao");
         gc.setXmlName("%sDao");
         gc.setServiceName("%sService");
         gc.setServiceImplName("%sServiceImpl");
         gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new OracleTypeConvert());
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("zhou10086");
        dsc.setUrl("jdbc:mysql://localhost:3306/chenpihui?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
         //strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        //strategy.setTablePrefix(new String[] { "tb_", "tsys_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
         strategy.setInclude(new String[] { "test" }); // 需要生成的表
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        // 自定义实体父类
        // strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
        // 自定义实体，公共字段
        // strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
        // 自定义 mapper 父类
        strategy.setEntityBuilderModel(true);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com");
        pc.setModuleName("chenpihui");
        pc.setController("controller");
        pc.setEntity("pojo.entity");
        pc.setMapper("dao");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setXml("dao");
        mpg.setPackageInfo(pc);

        // 执行生成
        mpg.execute();

        // 打印注入设置【可无】
        System.err.println(mpg.getCfg().getMap().get("abc"));
    }
}
