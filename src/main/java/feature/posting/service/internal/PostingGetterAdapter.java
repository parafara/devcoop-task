package feature.posting.service.internal;

import feature.posting.service.dto.request.PostingGetRequestDto;
import feature.posting.service.dto.response.PostingResponseDto;

public interface PostingGetterAdapter {
    PostingResponseDto get(PostingGetRequestDto request);
}
