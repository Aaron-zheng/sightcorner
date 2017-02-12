手上有一堆需要翻译的简单而又繁多的单词，因为我懒惰不想一个接一个翻译于是就写个翻译程序，因为谷歌API翻译要收费，所以选择了微软翻译的API，于是就有了微软API翻译教程了。
1. 首先点击并且注册账号。 https://datamarket.azure.com/developer/applications/
2. 注册账号后创建一个application，如果只是为了使用翻译的服务，则可以在创建的时候填写随便一个合法的url就可以了。
3. 进入网页，选择2,000,000一个月免费翻译量，这里是必须要选择的，不然的话你的程序在一秒左右只能翻译几个单词接着就死翘翘了，因为你没选择到免费翻译量。 https://datamarket.azure.com/dataset/1899a118-d202-492c-aa16-ba21c33c06cb
4. 下载jar可以选择maven配置。 http://code.google.com/p/microsoft-translator-java-api/
5. 编写程序并且输入client id和secret，进行翻译调用，可以看下面的简单程序例子
6. 大功告成！
2014_03_04_p0
2014_03_04_p1
2014_03_04_p2