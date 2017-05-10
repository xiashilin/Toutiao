package com.meiji.toutiao.module.video.content;

import com.meiji.toutiao.bean.news.NewsCommentBean;
import com.meiji.toutiao.module.news.comment.INewsComment;

import java.util.List;

/**
 * Created by Meiji on 2017/3/30.
 */

public interface IVideoContent {

    interface View extends INewsComment.View {

        void onSetAdapter(List<NewsCommentBean.DataBean.CommentsBean> list);

        void onSetVideoPlay(String url);
    }

    interface Presenter extends INewsComment.Presenter {

        void doLoadVideoData(String videoid);
    }

    @Deprecated
    interface Model extends INewsComment.Model {
        boolean requestData(String url);

        List<NewsCommentBean.DataBean.CommentsBean> getDataList();

        boolean requestVideoData(String videoid);

        String getVideoUrl();
    }
}
