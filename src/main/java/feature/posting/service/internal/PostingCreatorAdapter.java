package feature.posting.service.internal;

import feature.posting.service.dto.request.PostingCreateRequestDto;
import feature.posting.service.dto.response.PostingResponseDto;

public interface PostingCreatorAdapter {
    PostingResponseDto create(PostingCreateRequestDto request);
}
