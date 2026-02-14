package feature.posting.service.external;

import feature.posting.domain.Posting;

public interface PostingRepositoryAdapter {
    Posting save(Posting posting);
}
