package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class Item {

    //만약 등록, 수정에 대하여 각각 다르게 validation 을 적용하고 싶으면 이렇게 적용해서는 두개를 만들어야 되는 경우가 생긴다
    /**
     * 그리고 여기 id 같은 경우 front 에서 id 맞춰서 보내면 되지 않냐?
     * 라고 생각 할 수 있는데 넘기는 값들은 post-man 등 여러 방법으로
     * 조작해서 넘길 수가 있기 때문에 백엔드 로직에서도 검증 해야 한다.
     */
    /**
     * - groups
     * 이걸 사용해서 각각 다른 검증을 사용할 수 있다. >> @validated 만 가능
     * 좋긴한데 복잡해서 잘 사용하지 않는다.
     * 실무에서는 보통 다른 방법을 사용한다. 이런게 있다고 알고만 있다.
     */

//    @NotNull //수정 요구사항 추가
//    @NotNull(groups = UpdateCheck.class)
    private Long id;

//    @NotBlank(groups = {SaveCheck.class, UpdateCheck.class})
    private String itemName;

//    @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
//    @Range(min = 1000, max = 1000000, groups = {SaveCheck.class, UpdateCheck.class})
    private Integer price;

    /**
     * Range 는 hibernate.validator 인데 보통
     * 이거를 사용하니 사용해도 무방할 것 같다.
     */
//    @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
//    @Max(value = 9999, groups = {SaveCheck.class})
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
