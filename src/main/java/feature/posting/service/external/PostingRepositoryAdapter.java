package feature.posting.service.external;

import feature.posting.domain.Posting;

import java.util.List;

public interface PostingRepositoryAdapter {
    Posting save(Posting posting);
    Posting getById(Long id);
    List<Posting> getList(Long page, Long pageSize);
    Posting update(Posting changedPosting);
    void deleteById(Long id);
}
