package com.luzc.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author luzc
 * @date 2020/8/18 13:50
 * @desc
 */
public class MyTypeFilter implements TypeFilter {

    /*
     *metadataReader:读取到当前正在扫描类的信息
     * metadataReaderFactory：可以 获取到其他任何类信息
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类的注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前正在扫描的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类资源的路径（类的路径，哪个盘等）
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println("---->" + className);
        return className.contains("er");
    }
}
