/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.plugin;

import java.util.Properties;

/**
 * @author Clinton Begin
 */
public interface Interceptor {

  //在此方法中实现自己需要的功能，最后执行invocation.proceed()方法，实际就是调用method.invoke(target, args)方法，调用代理类
  Object intercept(Invocation invocation) throws Throwable;

  // target指的是被拦截的对象，对拦截对象生成一个代理对象，并返回
  Object plugin(Object target);

  //在plugin元素中配置所需要的参数，在插件初始化的时候调用一次
  void setProperties(Properties properties);

}
