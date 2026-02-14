package feature.posting.service.internal;

import feature.posting.service.dto.request.PostingDeleteRequestDto;

public interface PostingDeleterAdapter {
    void delete(PostingDeleteRequestDto request);
}
