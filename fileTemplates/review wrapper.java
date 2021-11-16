package by.todes.courtby.suiteconom.entitywrapperfeature.processreviewwrapper;

import by.todes.courtby.suitcommon.enums.classifierImpl.Entities;
import by.todes.courtby.suitcommon.enums.classifierImpl.T_44;
import by.todes.courtby.suitcommon.enums.classifierImpl.T_45;
import by.todes.courtby.suitcommon.features.entitywrappersfeature.WrapperImplementation;
import by.todes.courtby.suitcommon.persistence.entity.LawProcMotivatePart;
import by.todes.courtby.suitcommon.persistence.entity.proceduralActions.EconomProceedingClassic;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @author: d_shilko
 * Created: 6/2/2020
 *
 * WEB-INF/dynamicBlocks/proceeding/block3.xhtml
 */

@Getter
@Setter
@BlockNumber(code = ?)
@WrapperImplementation(entity = Entities.C_53, statement = {T_45.C_1}, production = {T_44.C_1})
public class EconomReviewWrapper_? extends EconomReviewWrapper {

    @Override
    public Map<String, Object> runEntityChain() {
        rememberMeAs("Процессуальное действие_текст_0_53", getProceeding().getProceedingType());
        

        return getResult();
    }
}