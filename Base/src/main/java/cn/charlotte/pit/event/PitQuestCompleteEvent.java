package cn.charlotte.pit.event;

import cn.charlotte.pit.data.sub.QuestData;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;

/**
 * @Creator Misoryan
 * @Date 2021/6/10 17:30
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@Data
public class PitQuestCompleteEvent extends PitEvent {
    private final Player player;
    private final QuestData questData;

}
