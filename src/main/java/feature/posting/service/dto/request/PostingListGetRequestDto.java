package feature.posting.service.dto.request;

public record PostingListGetRequestDto(
        Long page,
        Long pageSize
) {
}
