package feature.posting.service.internal;

import feature.posting.service.dto.request.PostingListGetRequestDto;
import feature.posting.service.dto.response.PostingResponseDto;

import java.util.List;

public interface PostingListGetterAdapter {
    List<PostingResponseDto> getList(PostingListGetRequestDto request);
}
