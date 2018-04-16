# Android MVP框架

- 使用MVP架构
- 网络请求封装使用Retrofit2,Rxjava2。
**简单实用示例**
```
 RxRestClient.builder()
                .url("http://news.baidu.com/")
                .build()
                .get()
                .execute(object : BaseObserver<String>(mView) {
                    override fun onNext(t: String) {
                        mView.success()
                    }
                })
```
- 使用dagger2,如果使用dagger2需要在相应模块添加kapt

[Glide使用方法](https://muyangmin.github.io/glide-docs-cn/doc/download-setup.html)
[BRVAH文档](https://www.jianshu.com/p/b343fcff51b0)