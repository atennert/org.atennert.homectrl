
package de.atennert.homectrl.dataprocessing;

import de.atennert.homectrl.event.EventBus;

public abstract class AbstractDataProcessor<T>
{
    public Integer processorId;

    protected T processorValue;

    protected EventBus eventBus;


    public AbstractDataProcessor(int id, T defaultValue)
    {
        processorId = id;
        processorValue = defaultValue;
    }

    public void setEventBus(EventBus eventBus)
    {
        this.eventBus = eventBus;
    }
}
