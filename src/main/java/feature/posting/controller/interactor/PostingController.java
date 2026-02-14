package feature.posting.controller.interactor;

import feature.posting.controller.internal.PostingControllerAdapter;
import feature.posting.service.dto.request.*;
import feature.posting.service.dto.response.PostingResponseDto;
import feature.posting.service.internal.*;

import java.util.List;

public class PostingController implements PostingControllerAdapter {
    private final PostingCreatorAdapter creator;
    private final PostingGetterAdapter getter;
    private final PostingListGetterAdapter listGetter;
    private final PostingUpdaterAdapter updater;
    private final PostingDeleterAdapter deleter;

    public PostingController(
            PostingCreatorAdapter creator,
            PostingGetterAdapter getter,
            PostingListGetterAdapter listGetter,
            PostingUpdaterAdapter updater,
            PostingDeleterAdapter deleter
    ) {
        this.creator = creator;
        this.getter = getter;
        this.listGetter = listGetter;
        this.updater = updater;
        this.deleter = deleter;
    }


    @Override
    public PostingResponseDto create(PostingCreateRequestDto request) {
        return creator.create(request);
    }

    @Override
    public PostingResponseDto get(PostingGetRequestDto request) {
        return getter.get(request);
    }

    @Override
    public List<PostingResponseDto> getList(PostingListGetRequestDto request) {
        return listGetter.getList(request);
    }

    @Override
    public PostingResponseDto update(PostingUpdateRequestDto request) {
        return updater.update(request);
    }

    @Override
    public void delete(PostingDeleteRequestDto request) {
        deleter.delete(request);
    }
}
