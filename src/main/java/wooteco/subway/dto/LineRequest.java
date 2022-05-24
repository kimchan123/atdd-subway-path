package wooteco.subway.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import wooteco.subway.domain.Line;

public class LineRequest {

    @NotBlank(message = "이름이 공백일 수 없습니다")
    private String name;

    @NotBlank(message = "색깔을 선택해야 합니다")
    private String color;

    @NotNull
    @Min(value = 1, message = "상행역은 1 이상이어야 합니다")
    private Long upStationId;

    @NotNull
    @Min(value = 1, message = "하행역은 1 이상이어야 합니다")
    private Long downStationId;

    @NotNull
    @Min(value = 1, message = "거리는 1 이상이여야 합니다")
    private int distance;

    @NotNull
    @Min(value = 0, message = "추가요금은 0 이상이여야 합니다.")
    private int extraFare;

    public LineRequest() {
    }

    public LineRequest(String name, String color, Long upStationId, Long downStationId,
                       int distance, int extraFare) {
        this.name = name;
        this.color = color;
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
        this.extraFare = extraFare;
    }

    public Line toLine() {
        return new Line(name, color, extraFare);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getExtraFare() {
        return extraFare;
    }

    public Long getUpStationId() {
        return upStationId;
    }

    public Long getDownStationId() {
        return downStationId;
    }

    public int getDistance() {
        return distance;
    }
}
