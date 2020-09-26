package com.cms.launcher.groups.groupSequence;

import javax.validation.GroupSequence;

import com.cms.launcher.groups.First;
import com.cms.launcher.groups.Second;
import com.cms.launcher.groups.Third;

/**
 * 组序列
 */
@GroupSequence({Third.class,Second.class, First.class})
public interface Group {
}
