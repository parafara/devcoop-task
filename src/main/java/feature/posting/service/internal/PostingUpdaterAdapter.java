package feature.posting.service.internal;

import feature.posting.service.dto.request.PostingUpdateRequestDto;
import feature.posting.service.dto.response.PostingResponseDto;

public interface PostingUpdaterAdapter {
    PostingResponseDto update(PostingUpdateRequestDto request);
}
