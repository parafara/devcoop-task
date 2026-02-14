package feature.posting.controller.internal;

import feature.posting.service.dto.request.*;
import feature.posting.service.dto.response.PostingResponseDto;

import java.util.List;

public interface PostingControllerAdapter {
    PostingResponseDto create(PostingCreateRequestDto request);
    PostingResponseDto get(PostingGetRequestDto request);
    List<PostingResponseDto> getList(PostingListGetRequestDto request);
    PostingResponseDto update(PostingUpdateRequestDto request);
    void delete(PostingDeleteRequestDto request);
}
