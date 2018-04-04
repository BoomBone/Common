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
