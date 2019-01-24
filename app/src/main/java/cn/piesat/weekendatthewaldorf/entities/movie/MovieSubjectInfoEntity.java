package cn.piesat.weekendatthewaldorf.entities.movie;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieSubjectInfoEntity {


    /**
     * rating : {"max":10,"average":5.3,"details":{"1":1068,"3":5405,"2":4055,"5":272,"4":1279},"stars":"30","min":0}
     * reviews_count : 464
     * videos : [{"source":{"literal":"iqiyi","pic":"https://img3.doubanio.com/f/movie/7c9e516e02c6fe445b6559c0dd2a705e8b17d1c9/pics/movie/video-iqiyi.png","name":"爱奇艺视频"},"sample_link":"http://www.iqiyi.com/v_19rrbldvk8.html?vfm=m_331_dbdy&fv=4904d94982104144a1548dd9040df241","video_id":"19rrbldvk8","need_pay":true}]
     * wish_count : 13013
     * original_title : Maze Runner: The Death Cure
     * blooper_urls : ["http://vt1.doubanio.com/201901241044/0ae609c43b4d3a2c3f3aee2e2bb84721/view/movie/M/302260637.mp4","http://vt1.doubanio.com/201901241044/ecb0fb3b7eae68bef8be837421467097/view/movie/M/302260450.mp4","http://vt1.doubanio.com/201901241044/60e30dfcd5c29cc4b8c913b79ec2be78/view/movie/M/302260600.mp4","http://vt1.doubanio.com/201901241044/5aaaef299198bf7f9d4677b86f3b4387/view/movie/M/302260837.mp4"]
     * collect_count : 79223
     * images : {"small":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508618114.webp","large":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508618114.webp","medium":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508618114.webp"}
     * douban_site :
     * year : 2018
     * popular_comments : [{"rating":{"max":5,"value":3,"min":0},"useful_count":379,"author":{"uid":"52286623","avatar":"http://img1.doubanio.com/icon/u52286623-2.jpg","signature":"","alt":"https://www.douban.com/people/52286623/","id":"52286623","name":"what'swilliam"},"subject_id":"26004132","content":"3.1星。眼看着这部\u201c青少年跑酷科幻电影\u201d变成了\u201c青年不跑酷了科幻电影\u201d。整部电影冗长且无趣，部分角色为了挂而挂，编剧都懒得动脑子了。。。其实吧，这部电影要不是为了完结而完结，没必要存在的。。。","created_at":"2018-01-25 23:51:50","id":"1312880496"},{"rating":{"max":5,"value":3,"min":0},"useful_count":539,"author":{"uid":"tanknox","avatar":"http://img1.doubanio.com/icon/u41521823-21.jpg","signature":"不喝鸡汤，没有鸡血。","alt":"https://www.douban.com/people/tanknox/","id":"41521823","name":"TanKnoX"},"subject_id":"26004132","content":"有毒吧这个剧情\u2026\u2026男主读完兄弟的信之后十分感动，然后写下了女主的名字\u2026\u2026另外翻译全程yy得有点过分了\u2026\u2026","created_at":"2018-01-26 21:53:31","id":"1292584856"},{"rating":{"max":5,"value":2,"min":0},"useful_count":119,"author":{"uid":"shunong","avatar":"http://img3.doubanio.com/icon/u1303086-68.jpg","signature":"资深假惺惺","alt":"https://www.douban.com/people/shunong/","id":"1303086","name":"舒农"},"subject_id":"26004132","content":"删掉一个小时会更好。第三幕长到整部电影仿佛3个小时。","created_at":"2018-01-24 21:34:45","id":"1312242381"},{"rating":{"max":5,"value":2,"min":0},"useful_count":231,"author":{"uid":"172416865","avatar":"http://img1.doubanio.com/icon/u172416865-3.jpg","signature":"","alt":"https://www.douban.com/people/172416865/","id":"172416865","name":"懒人的主"},"subject_id":"26004132","content":"刚看完，感觉越拍越傻了，托马斯被实验了3年，难道3年时间都没验出来他的血清就是解药？而且活生生把一部惊悚电影拍成了动作电影也是醉了，没什么新意就尽量别拍续集了。","created_at":"2018-01-26 23:19:51","id":"1313395106"}]
     * alt : https://movie.douban.com/subject/26004132/
     * id : 26004132
     * mobile_url : https://movie.douban.com/subject/26004132/mobile
     * photos_count : 418
     * pubdate : 2018-01-26
     * title : 移动迷宫3：死亡解药
     * do_count : null
     * has_video : true
     * share_url : http://m.douban.com/movie/subject/26004132
     * seasons_count : null
     * languages : ["英语"]
     * schedule_url :
     * writers : [{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1522030067.81.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1522030067.81.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1522030067.81.webp"},"name_en":"T.S. Nowlin","name":"T·S·诺林","alt":"https://movie.douban.com/celebrity/1342902/","id":"1342902"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1426087493.08.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1426087493.08.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1426087493.08.webp"},"name_en":"James Dashner","name":"詹姆斯·达什纳","alt":"https://movie.douban.com/celebrity/1333681/","id":"1333681"}]
     * pubdates : ["2018-01-26(美国)","2018-01-26(中国大陆)"]
     * website :
     * tags : ["科幻","美国","动作","冒险","反乌托邦","2018","小说改编","悬疑","惊悚","青春"]
     * has_schedule : false
     * durations : ["142分钟"]
     * genres : ["动作","科幻","冒险"]
     * collection : null
     * trailers : [{"medium":"http://img1.doubanio.com/img/trailer/medium/2512420390.jpg?","title":"中国预告片 (中文字幕)","subject_id":"26004132","alt":"https://movie.douban.com/trailer/227059/","small":"http://img1.doubanio.com/img/trailer/small/2512420390.jpg?","resource_url":"http://vt1.doubanio.com/201901241044/9c142d80a0e393244e1d3f7a1cba214e/view/movie/M/302270059.mp4","id":"227059"},{"medium":"http://img3.doubanio.com/img/trailer/medium/2512246766.jpg?","title":"中国预告片：乐高版 (中文字幕)","subject_id":"26004132","alt":"https://movie.douban.com/trailer/226927/","small":"http://img3.doubanio.com/img/trailer/small/2512246766.jpg?","resource_url":"http://vt1.doubanio.com/201901241044/93c93f26651cc20126d305d1169cc63b/view/movie/M/302260927.mp4","id":"226927"},{"medium":"http://img1.doubanio.com/img/trailer/medium/2512030130.jpg?","title":"中国预告片：肾上腺素版 (中文字幕)","subject_id":"26004132","alt":"https://movie.douban.com/trailer/226763/","small":"http://img1.doubanio.com/img/trailer/small/2512030130.jpg?","resource_url":"http://vt1.doubanio.com/201901241044/d7b98e0dc96c9a3a4f99eb3de6c1591d/view/movie/M/302260763.mp4","id":"226763"},{"medium":"http://img1.doubanio.com/img/trailer/medium/2511722934.jpg?","title":"中国预告片 (中文字幕)","subject_id":"26004132","alt":"https://movie.douban.com/trailer/226701/","small":"http://img1.doubanio.com/img/trailer/small/2511722934.jpg?","resource_url":"http://vt1.doubanio.com/201901241044/4ea287ae778a51808c598436011cbe0f/view/movie/M/302260701.mp4","id":"226701"}]
     * episodes_count : null
     * trailer_urls : ["http://vt1.doubanio.com/201901241044/9c142d80a0e393244e1d3f7a1cba214e/view/movie/M/302270059.mp4","http://vt1.doubanio.com/201901241044/93c93f26651cc20126d305d1169cc63b/view/movie/M/302260927.mp4","http://vt1.doubanio.com/201901241044/d7b98e0dc96c9a3a4f99eb3de6c1591d/view/movie/M/302260763.mp4","http://vt1.doubanio.com/201901241044/4ea287ae778a51808c598436011cbe0f/view/movie/M/302260701.mp4"]
     * has_ticket : false
     * bloopers : [{"medium":"http://img1.doubanio.com/img/trailer/medium/2511634245.jpg?","title":"花絮 (中文字幕)","subject_id":"26004132","alt":"https://movie.douban.com/trailer/226637/","small":"http://img1.doubanio.com/img/trailer/small/2511634245.jpg?","resource_url":"http://vt1.doubanio.com/201901241044/0ae609c43b4d3a2c3f3aee2e2bb84721/view/movie/M/302260637.mp4","id":"226637"},{"medium":"http://img1.doubanio.com/img/trailer/medium/2511379821.jpg?","title":"花絮：豆瓣电影专访《移动迷宫3》跑男团 (中文字幕)","subject_id":"26004132","alt":"https://movie.douban.com/trailer/226450/","small":"http://img1.doubanio.com/img/trailer/small/2511379821.jpg?","resource_url":"http://vt1.doubanio.com/201901241044/ecb0fb3b7eae68bef8be837421467097/view/movie/M/302260450.mp4","id":"226450"},{"medium":"http://img1.doubanio.com/img/trailer/medium/2511534902.jpg?","title":"MV：许魏洲献唱中推广曲《迷宫》 (中文字幕)","subject_id":"26004132","alt":"https://movie.douban.com/trailer/226600/","small":"http://img1.doubanio.com/img/trailer/small/2511534902.jpg?","resource_url":"http://vt1.doubanio.com/201901241044/60e30dfcd5c29cc4b8c913b79ec2be78/view/movie/M/302260600.mp4","id":"226600"},{"medium":"http://img3.doubanio.com/img/trailer/medium/2512140349.jpg?","title":"其它花絮：曼联特辑 (中文字幕)","subject_id":"26004132","alt":"https://movie.douban.com/trailer/226837/","small":"http://img3.doubanio.com/img/trailer/small/2512140349.jpg?","resource_url":"http://vt1.doubanio.com/201901241044/5aaaef299198bf7f9d4677b86f3b4387/view/movie/M/302260837.mp4","id":"226837"}]
     * clip_urls : ["http://vt1.doubanio.com/201901241044/dde0093fa259288e0b1028ecec9c4503/view/movie/M/302260558.mp4","http://vt1.doubanio.com/201901241044/958746314016eaa21bde4058a31d0060/view/movie/M/302250928.mp4"]
     * current_season : null
     * casts : [{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p53688.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p53688.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p53688.webp"},"name_en":"Dylan O'Brien","name":"迪伦·奥布莱恩","alt":"https://movie.douban.com/celebrity/1314963/","id":"1314963"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13769.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13769.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13769.webp"},"name_en":"Kaya Scodelario","name":"卡雅·斯考达里奥","alt":"https://movie.douban.com/celebrity/1031178/","id":"1031178"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1395179688.42.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1395179688.42.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1395179688.42.webp"},"name_en":"Ki Hong Lee","name":"李起弘","alt":"https://movie.douban.com/celebrity/1333684/","id":"1333684"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1074.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1074.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1074.webp"},"name_en":"Thomas Brodie-Sangster","name":"托马斯·布罗迪-桑斯特","alt":"https://movie.douban.com/celebrity/1016669/","id":"1016669"}]
     * countries : ["美国"]
     * mainland_pubdate : 2018-01-26
     * photos : [{"thumb":"https://img1.doubanio.com/view/photo/m/public/p2509193839.webp","image":"https://img1.doubanio.com/view/photo/l/public/p2509193839.webp","cover":"https://img1.doubanio.com/view/photo/sqs/public/p2509193839.webp","alt":"https://movie.douban.com/photos/photo/2509193839/","id":"2509193839","icon":"https://img1.doubanio.com/view/photo/s/public/p2509193839.webp"},{"thumb":"https://img1.doubanio.com/view/photo/m/public/p2540622109.webp","image":"https://img1.doubanio.com/view/photo/l/public/p2540622109.webp","cover":"https://img1.doubanio.com/view/photo/sqs/public/p2540622109.webp","alt":"https://movie.douban.com/photos/photo/2540622109/","id":"2540622109","icon":"https://img1.doubanio.com/view/photo/s/public/p2540622109.webp"},{"thumb":"https://img1.doubanio.com/view/photo/m/public/p2540622108.webp","image":"https://img1.doubanio.com/view/photo/l/public/p2540622108.webp","cover":"https://img1.doubanio.com/view/photo/sqs/public/p2540622108.webp","alt":"https://movie.douban.com/photos/photo/2540622108/","id":"2540622108","icon":"https://img1.doubanio.com/view/photo/s/public/p2540622108.webp"},{"thumb":"https://img1.doubanio.com/view/photo/m/public/p2540622107.webp","image":"https://img1.doubanio.com/view/photo/l/public/p2540622107.webp","cover":"https://img1.doubanio.com/view/photo/sqs/public/p2540622107.webp","alt":"https://movie.douban.com/photos/photo/2540622107/","id":"2540622107","icon":"https://img1.doubanio.com/view/photo/s/public/p2540622107.webp"},{"thumb":"https://img3.doubanio.com/view/photo/m/public/p2540622106.webp","image":"https://img3.doubanio.com/view/photo/l/public/p2540622106.webp","cover":"https://img3.doubanio.com/view/photo/sqs/public/p2540622106.webp","alt":"https://movie.douban.com/photos/photo/2540622106/","id":"2540622106","icon":"https://img3.doubanio.com/view/photo/s/public/p2540622106.webp"},{"thumb":"https://img1.doubanio.com/view/photo/m/public/p2533727399.webp","image":"https://img1.doubanio.com/view/photo/l/public/p2533727399.webp","cover":"https://img1.doubanio.com/view/photo/sqs/public/p2533727399.webp","alt":"https://movie.douban.com/photos/photo/2533727399/","id":"2533727399","icon":"https://img1.doubanio.com/view/photo/s/public/p2533727399.webp"},{"thumb":"https://img1.doubanio.com/view/photo/m/public/p2528936979.webp","image":"https://img1.doubanio.com/view/photo/l/public/p2528936979.webp","cover":"https://img1.doubanio.com/view/photo/sqs/public/p2528936979.webp","alt":"https://movie.douban.com/photos/photo/2528936979/","id":"2528936979","icon":"https://img1.doubanio.com/view/photo/s/public/p2528936979.webp"},{"thumb":"https://img1.doubanio.com/view/photo/m/public/p2528936977.webp","image":"https://img1.doubanio.com/view/photo/l/public/p2528936977.webp","cover":"https://img1.doubanio.com/view/photo/sqs/public/p2528936977.webp","alt":"https://movie.douban.com/photos/photo/2528936977/","id":"2528936977","icon":"https://img1.doubanio.com/view/photo/s/public/p2528936977.webp"},{"thumb":"https://img3.doubanio.com/view/photo/m/public/p2528936976.webp","image":"https://img3.doubanio.com/view/photo/l/public/p2528936976.webp","cover":"https://img3.doubanio.com/view/photo/sqs/public/p2528936976.webp","alt":"https://movie.douban.com/photos/photo/2528936976/","id":"2528936976","icon":"https://img3.doubanio.com/view/photo/s/public/p2528936976.webp"},{"thumb":"https://img3.doubanio.com/view/photo/m/public/p2528936975.webp","image":"https://img3.doubanio.com/view/photo/l/public/p2528936975.webp","cover":"https://img3.doubanio.com/view/photo/sqs/public/p2528936975.webp","alt":"https://movie.douban.com/photos/photo/2528936975/","id":"2528936975","icon":"https://img3.doubanio.com/view/photo/s/public/p2528936975.webp"}]
     * summary : 托马斯（迪伦·奥布莱恩饰）率领的林间斗士在经历了迷宫逃脱和末日丧尸的生死考验后，终于迎来最后的正邪较量。由托马斯、纽特（托马斯·桑斯特饰）等人领军的营救团队，耗时三年筹划营救被抓走的米诺，却意外地发现米诺不在劫获的那截火车上。经调查得知，米诺深陷在WCKD组织的控制之中，托马斯和纽特毅然决定起身前往被称为“最后之都”的人类最后净土，更不惜利用背叛林间斗士投身WCKD的特蕾莎（卡雅·斯考达里奥饰）闯入WCKD，营救米诺和其他人。
     * clips : [{"medium":"http://img3.doubanio.com/img/trailer/medium/2511459538.jpg?","title":"片段 (中文字幕)","subject_id":"26004132","alt":"https://movie.douban.com/trailer/226558/","small":"http://img3.doubanio.com/img/trailer/small/2511459538.jpg?","resource_url":"http://vt1.doubanio.com/201901241044/dde0093fa259288e0b1028ecec9c4503/view/movie/M/302260558.mp4","id":"226558"},{"medium":"http://img1.doubanio.com/img/trailer/medium/2510150361.jpg?","title":"片段 (中文字幕)","subject_id":"26004132","alt":"https://movie.douban.com/trailer/225928/","small":"http://img1.doubanio.com/img/trailer/small/2510150361.jpg?","resource_url":"http://vt1.doubanio.com/201901241044/958746314016eaa21bde4058a31d0060/view/movie/M/302250928.mp4","id":"225928"}]
     * subtype : movie
     * directors : [{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1417887954.94.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1417887954.94.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1417887954.94.webp"},"name_en":"Wes Ball","name":"韦斯·鲍尔","alt":"https://movie.douban.com/celebrity/1332723/","id":"1332723"}]
     * comments_count : 17720
     * popular_reviews : [{"rating":{"max":5,"value":2,"min":0},"title":"导演的脑回路就是个迷宫，走进去就出不来了","subject_id":"26004132","author":{"uid":"lingrui1995","avatar":"http://img3.doubanio.com/icon/u63688511-18.jpg","signature":"一个影迷","alt":"https://www.douban.com/people/lingrui1995/","id":"63688511","name":"凌睿"},"summary":"整个系列都没有移动，为什么在片名里写个\u201c移动\u201d？你考虑过联通和电信的感受吗？ 《移动迷宫1》没有移动，好歹还有迷宫。 《移动迷宫2》没有移动，没有迷宫，好歹还很二。 《移动迷宫3：死亡解药》是移动、迷宫...","alt":"https://movie.douban.com/review/9104389/","id":"9104389"},{"rating":{"max":5,"value":2,"min":0},"title":"《移动迷宫3》：所谓的反乌托邦其实就是美国爽文","subject_id":"26004132","author":{"uid":"162000558","avatar":"http://img1.doubanio.com/icon/u162000558-4.jpg","signature":"","alt":"https://www.douban.com/people/162000558/","id":"162000558","name":"架空"},"summary":"经历了迷宫和丧尸的考验，《移动迷宫》系列终于在今天迎来了\u201c收官一跑\u201d。 作为三部曲的最后一部，《移动迷宫3：死亡解药》把四年间的所有谜团一次性解开，而以托马斯为首的林间地\u201c跑男团\u201d成员们，也将一边拯...","alt":"https://movie.douban.com/review/9103822/","id":"9103822"},{"rating":{"max":5,"value":3,"min":0},"title":"只为纪念我的newt","subject_id":"26004132","author":{"uid":"74010591","avatar":"http://img3.doubanio.com/icon/user_normal.jpg","signature":"","alt":"https://www.douban.com/people/74010591/","id":"74010591","name":"开到荼蘼花事了"},"summary":"电影给了三星，完全是冲着newt这个角色和桑总的面子嗯。 开始看移动迷宫是男票推荐的，第一部里面就发现newt比男一更有魅力，然后就意犹未尽的看了第二部，可惜第二部里面给newt的戏份略少，感觉没看过瘾，当时距...","alt":"https://movie.douban.com/review/9106985/","id":"9106985"},{"rating":{"max":5,"value":4,"min":0},"title":"剧透吐槽千里救minho之再见了我的Newt","subject_id":"26004132","author":{"uid":"AnnaDoyle","avatar":"http://img1.doubanio.com/icon/u30263572-12.jpg","signature":"Don't blink.","alt":"https://www.douban.com/people/AnnaDoyle/","id":"30263572","name":"AnnaDoyle"},"summary":"1. 第三部别名：千里救minho 2. 可怜的minho 3. 我不太清楚小说里的泰瑞沙，但上一部她已经没啥存在感（相比Brenda）不拉好感了这一部看到更没啥感觉了 4. 这就是一个看脸的世界，谁能留Newt的发型还能保持帅气？...","alt":"https://movie.douban.com/review/9088112/","id":"9088112"},{"rating":{"max":5,"value":3,"min":0},"title":"你对《移动迷宫》系列探讨的主旨\u201c救朋友还是救世界\u201d有何看法？","subject_id":"26004132","author":{"uid":"151402596","avatar":"http://img1.doubanio.com/icon/u151402596-4.jpg","signature":"","alt":"https://www.douban.com/people/151402596/","id":"151402596","name":"Agon"},"summary":"可以试试回答另一个问题：如果牺牲五个人，能救五百万人，该不该牺牲？ 如果是五个你的至亲和五百万流氓呢？ 如果是五个流氓和五百万非洲文盲呢？ 如果是五个非洲文盲和五百万世界权贵呢？ 如果是五个世界权贵和...","alt":"https://movie.douban.com/review/9110398/","id":"9110398"},{"rating":{"max":5,"value":1,"min":0},"title":"难道该死的都是好人？","subject_id":"26004132","author":{"uid":"173187137","avatar":"http://img1.doubanio.com/icon/u173187137-1.jpg","signature":"","alt":"https://www.douban.com/people/173187137/","id":"173187137","name":"moonlit bear"},"summary":"这是我第一次写影评。          我以前从未写过影评。这也是我第一次，在还没看完一部电影时就气得恨不得马上甩凳子走人。          就在半个小时之前，我看完了这部电影。电影的内容很简单，讲的就是当人类面对...","alt":"https://movie.douban.com/review/9107630/","id":"9107630"},{"rating":{"max":5,"value":2,"min":0},"title":"对着天空大吼一声：\u201c我是主角！\u201d","subject_id":"26004132","author":{"uid":"56453834","avatar":"http://img1.doubanio.com/icon/u56453834-2.jpg","signature":"","alt":"https://www.douban.com/people/56453834/","id":"56453834","name":"ltheyes"},"summary":"叫迷宫没有迷宫也就算了，所有配角和剧情统统给主角光环让路，最后还给个360度大特写，简直怀疑男主跟导演有py交易\u2026\u2026     我是主角托马斯。 别问为什么我是主角，反正我自带光环。  前1+2集里，全球又毁灭了，...","alt":"https://movie.douban.com/review/9103831/","id":"9103831"},{"rating":{"max":5,"value":3,"min":0},"title":"死亡没有解药","subject_id":"26004132","author":{"uid":"163879289","avatar":"http://img1.doubanio.com/icon/u163879289-3.jpg","signature":"","alt":"https://www.douban.com/people/163879289/","id":"163879289","name":"三只兔子"},"summary":"相对于第一篇差了好多 全部看下来除了剧情不知所云 还有拖拉的讲述 托马斯率领的林间斗士在经历了迷宫逃脱和末日丧尸的生死考验后，终于迎来最后的正邪较量。由托马斯等人领军的营救团队，耗时三年筹划营救被抓走...","alt":"https://movie.douban.com/review/9301548/","id":"9301548"},{"rating":{"max":5,"value":3,"min":0},"title":"兄弟情深的基情跑男，当然要烧死异性恋！","subject_id":"26004132","author":{"uid":"65569388","avatar":"http://img1.doubanio.com/icon/u65569388-2.jpg","signature":"路人视角，不吹不黑","alt":"https://www.douban.com/people/65569388/","id":"65569388","name":"大海里的针"},"summary":"以前大海总觉得日本动漫中二病泛滥，动不动就是青少年主角拯救世界。最近看了新上映的《移动迷宫3》，发现美国人中二起来比日本人是有过之而无不及。 《移动迷宫3：死亡解药》是这个系列的最终章，影片质量和同样...","alt":"https://movie.douban.com/review/9115993/","id":"9115993"},{"rating":{"max":5,"value":3,"min":0},"title":"对于大家吐槽的三观问题的个人浅见","subject_id":"26004132","author":{"uid":"164445055","avatar":"http://img1.doubanio.com/icon/u164445055-1.jpg","signature":"","alt":"https://www.douban.com/people/164445055/","id":"164445055","name":"Netkr-网客"},"summary":"大家热议的本片价值观问题集中在主角为什么不乖乖配合WCKD公司研发解药解救全人类皆大欢喜以及难民愚蠢毁灭城市耽误解药研发。 首先，男主之前是为WCKD公司工作的，这点大家忘了吗?说明男主曾经信任该公司可以研...","alt":"https://movie.douban.com/review/9122195/","id":"9122195"}]
     * ratings_count : 56774
     * aka : ["移动迷宫3","死亡解药","The Death Cure"]
     */

    public
    RatingBean rating;
    public
    int reviews_count;
    public
    int wish_count;
    public
    String original_title;
    public
    int collect_count;
    public
    ImagesBean images;
    public
    String douban_site;
    public
    String year;
    public
    String alt;
    public
    String id;
    public
    String mobile_url;
    public
    int photos_count;
    public
    String pubdate;
    public
    String title;
    public
    Object do_count;
    public
    boolean has_video;
    public
    String share_url;
    public
    Object seasons_count;
    public
    String schedule_url;
    public
    String website;
    public
    boolean has_schedule;
    public
    Object collection;
    public
    Object episodes_count;
    public
    boolean has_ticket;
    public
    Object current_season;
    public
    String mainland_pubdate;
    public
    String summary;
    public
    String subtype;
    public
    int comments_count;
    public
    int ratings_count;
    public
    List<VideosBean> videos;
    public
    List<String> blooper_urls;
    public
    List<PopularCommentsBean> popular_comments;
    public
    List<String> languages;
    public
    List<WritersBean> writers;
    public
    List<String> pubdates;
    public
    List<String> tags;
    public
    List<String> durations;
    public
    List<String> genres;
    public
    List<TrailersBean> trailers;
    public
    List<String> trailer_urls;
    public
    List<BloopersBean> bloopers;
    public
    List<String> clip_urls;
    public
    List<CastsBean> casts;
    public
    List<String> countries;
    public
    List<PhotosBean> photos;
    public
    List<ClipsBean> clips;
    public
    List<DirectorsBean> directors;
    public
    List<PopularReviewsBean> popular_reviews;
    public
    List<String> aka;
    public static class RatingBean {
        /**
         * max : 10
         * average : 5.3
         * details : {"1":1068,"3":5405,"2":4055,"5":272,"4":1279}
         * stars : 30
         * min : 0
         */
        public
        int max;
        public
        double average;
        public
        DetailsBean details;
        public
        String stars;
        public
        int min;
        public static class DetailsBean {
            /**
             * 1 : 1068.0
             * 3 : 5405.0
             * 2 : 4055.0
             * 5 : 272.0
             * 4 : 1279.0
             */

            @SerializedName("1")
            public
            double _$1;
            @SerializedName("3")
            public
            double _$3;
            @SerializedName("2")
            public
            double _$2;
            @SerializedName("5")
            public
            double _$5;
            @SerializedName("4")
            public
            double _$4;

        }
    }

    public static class ImagesBean {
        /**
         * small : http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508618114.webp
         * large : http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508618114.webp
         * medium : http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2508618114.webp
         */

        public
        String small;
        public
        String large;
        public
        String medium;


    }

    public static class VideosBean {
        /**
         * source : {"literal":"iqiyi","pic":"https://img3.doubanio.com/f/movie/7c9e516e02c6fe445b6559c0dd2a705e8b17d1c9/pics/movie/video-iqiyi.png","name":"爱奇艺视频"}
         * sample_link : http://www.iqiyi.com/v_19rrbldvk8.html?vfm=m_331_dbdy&fv=4904d94982104144a1548dd9040df241
         * video_id : 19rrbldvk8
         * need_pay : true
         */

        public
        SourceBean source;
        public
        String sample_link;
        public
        String video_id;
        public
        boolean need_pay;



        public static class SourceBean {
            /**
             * literal : iqiyi
             * pic : https://img3.doubanio.com/f/movie/7c9e516e02c6fe445b6559c0dd2a705e8b17d1c9/pics/movie/video-iqiyi.png
             * name : 爱奇艺视频
             */

            public
            String literal;
            public
            String pic;
            public
            String name;

        }
    }

    public static class PopularCommentsBean {
        /**
         * rating : {"max":5,"value":3,"min":0}
         * useful_count : 379
         * author : {"uid":"52286623","avatar":"http://img1.doubanio.com/icon/u52286623-2.jpg","signature":"","alt":"https://www.douban.com/people/52286623/","id":"52286623","name":"what'swilliam"}
         * subject_id : 26004132
         * content : 3.1星。眼看着这部“青少年跑酷科幻电影”变成了“青年不跑酷了科幻电影”。整部电影冗长且无趣，部分角色为了挂而挂，编剧都懒得动脑子了。。。其实吧，这部电影要不是为了完结而完结，没必要存在的。。。
         * created_at : 2018-01-25 23:51:50
         * id : 1312880496
         */

        public
        RatingBeanX rating;
        public
        int useful_count;
        public
        AuthorBean author;
        public
        String subject_id;
        public
        String content;
        public
        String created_at;
        public
        String id;


        public static class RatingBeanX {
            /**
             * max : 5
             * value : 3.0
             * min : 0
             */

            public
            int max;
            public
            double value;
            public
            int min;

        }

        public static class AuthorBean {
            /**
             * uid : 52286623
             * avatar : http://img1.doubanio.com/icon/u52286623-2.jpg
             * signature :
             * alt : https://www.douban.com/people/52286623/
             * id : 52286623
             * name : what'swilliam
             */

            public
            String uid;
            public
            String avatar;
            public
            String signature;
            public
            String alt;
            public
            String id;
            public
            String name;

        }
    }

    public static class WritersBean {
        /**
         * avatars : {"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1522030067.81.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1522030067.81.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1522030067.81.webp"}
         * name_en : T.S. Nowlin
         * name : T·S·诺林
         * alt : https://movie.douban.com/celebrity/1342902/
         * id : 1342902
         */

        public
        AvatarsBean avatars;
        public
        String name_en;
        public
        String name;
        public
        String alt;
        public
        String id;

        public static class AvatarsBean {
            /**
             * small : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1522030067.81.webp
             * large : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1522030067.81.webp
             * medium : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1522030067.81.webp
             */

            public
            String small;
            public
            String large;
            public
            String medium;

        }
    }

    public static class TrailersBean {
        /**
         * medium : http://img1.doubanio.com/img/trailer/medium/2512420390.jpg?
         * title : 中国预告片 (中文字幕)
         * subject_id : 26004132
         * alt : https://movie.douban.com/trailer/227059/
         * small : http://img1.doubanio.com/img/trailer/small/2512420390.jpg?
         * resource_url : http://vt1.doubanio.com/201901241044/9c142d80a0e393244e1d3f7a1cba214e/view/movie/M/302270059.mp4
         * id : 227059
         */

        public
        String medium;
        public
        String title;
        public
        String subject_id;
        public
        String alt;
        public
        String small;
        public
        String resource_url;
        public
        String id;

    }

    public static class BloopersBean {
        /**
         * medium : http://img1.doubanio.com/img/trailer/medium/2511634245.jpg?
         * title : 花絮 (中文字幕)
         * subject_id : 26004132
         * alt : https://movie.douban.com/trailer/226637/
         * small : http://img1.doubanio.com/img/trailer/small/2511634245.jpg?
         * resource_url : http://vt1.doubanio.com/201901241044/0ae609c43b4d3a2c3f3aee2e2bb84721/view/movie/M/302260637.mp4
         * id : 226637
         */

        public
        String medium;
        public
        String title;
        public
        String subject_id;
        public
        String alt;
        public
        String small;
        public
        String resource_url;
        public
        String id;

    }

    public static class CastsBean {
        /**
         * avatars : {"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p53688.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p53688.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p53688.webp"}
         * name_en : Dylan O'Brien
         * name : 迪伦·奥布莱恩
         * alt : https://movie.douban.com/celebrity/1314963/
         * id : 1314963
         */

        public
        AvatarsBeanX avatars;
        public
        String name_en;
        public
        String name;
        public
        String alt;
        public
        String id;


        public static class AvatarsBeanX {
            /**
             * small : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p53688.webp
             * large : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p53688.webp
             * medium : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p53688.webp
             */

            public
            String small;
            public
            String large;
            public
            String medium;

        }
    }

    public static class PhotosBean {
        /**
         * thumb : https://img1.doubanio.com/view/photo/m/public/p2509193839.webp
         * image : https://img1.doubanio.com/view/photo/l/public/p2509193839.webp
         * cover : https://img1.doubanio.com/view/photo/sqs/public/p2509193839.webp
         * alt : https://movie.douban.com/photos/photo/2509193839/
         * id : 2509193839
         * icon : https://img1.doubanio.com/view/photo/s/public/p2509193839.webp
         */

        public
        String thumb;
        public
        String image;
        public
        String cover;
        public
        String alt;
        public
        String id;
        public
        String icon;

    }

    public static class ClipsBean {
        /**
         * medium : http://img3.doubanio.com/img/trailer/medium/2511459538.jpg?
         * title : 片段 (中文字幕)
         * subject_id : 26004132
         * alt : https://movie.douban.com/trailer/226558/
         * small : http://img3.doubanio.com/img/trailer/small/2511459538.jpg?
         * resource_url : http://vt1.doubanio.com/201901241044/dde0093fa259288e0b1028ecec9c4503/view/movie/M/302260558.mp4
         * id : 226558
         */

        public
        String medium;
        public
        String title;
        public
        String subject_id;
        public
        String alt;
        public
        String small;
        public
        String resource_url;
        public
        String id;

    }

    public static class DirectorsBean {
        /**
         * avatars : {"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1417887954.94.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1417887954.94.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1417887954.94.webp"}
         * name_en : Wes Ball
         * name : 韦斯·鲍尔
         * alt : https://movie.douban.com/celebrity/1332723/
         * id : 1332723
         */

        public
        AvatarsBeanXX avatars;
        public
        String name_en;
        public
        String name;
        public
        String alt;
        public
        String id;


        public static class AvatarsBeanXX {
            /**
             * small : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1417887954.94.webp
             * large : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1417887954.94.webp
             * medium : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1417887954.94.webp
             */

            public
            String small;
            public
            String large;
            public
            String medium;

        }
    }

    public static class PopularReviewsBean {
        /**
         * rating : {"max":5,"value":2,"min":0}
         * title : 导演的脑回路就是个迷宫，走进去就出不来了
         * subject_id : 26004132
         * author : {"uid":"lingrui1995","avatar":"http://img3.doubanio.com/icon/u63688511-18.jpg","signature":"一个影迷","alt":"https://www.douban.com/people/lingrui1995/","id":"63688511","name":"凌睿"}
         * summary : 整个系列都没有移动，为什么在片名里写个“移动”？你考虑过联通和电信的感受吗？ 《移动迷宫1》没有移动，好歹还有迷宫。 《移动迷宫2》没有移动，没有迷宫，好歹还很二。 《移动迷宫3：死亡解药》是移动、迷宫...
         * alt : https://movie.douban.com/review/9104389/
         * id : 9104389
         */

        public
        RatingBeanXX rating;
        public
        String title;
        public
        String subject_id;
        public
        AuthorBeanX author;
        public
        String summary;
        public
        String alt;
        public
        String id;


        public static class RatingBeanXX {
            /**
             * max : 5
             * value : 2.0
             * min : 0
             */

            public
            int max;
            public
            double value;
            public
            int min;


        }

        public static class AuthorBeanX {
            /**
             * uid : lingrui1995
             * avatar : http://img3.doubanio.com/icon/u63688511-18.jpg
             * signature : 一个影迷
             * alt : https://www.douban.com/people/lingrui1995/
             * id : 63688511
             * name : 凌睿
             */

            public
            String uid;
            public
            String avatar;
            public
            String signature;
            public
            String alt;
            public
            String id;
            public
            String name;

        }
    }
}
