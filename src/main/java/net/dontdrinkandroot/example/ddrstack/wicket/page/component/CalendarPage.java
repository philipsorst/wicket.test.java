package net.dontdrinkandroot.example.ddrstack.wicket.page.component;

import net.dontdrinkandroot.example.ddrstack.wicket.page.DecoratorPage;
import net.dontdrinkandroot.extensions.wicket.component.calendar.DaySelectionTable;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import java.util.Calendar;

public class CalendarPage extends DecoratorPage<Void>
{
    public CalendarPage(PageParameters parameters)
    {
        super(parameters);
    }

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        DaySelectionTable daySelectionTable = new DaySelectionTable(
                "daySelection",
                new Model<Integer>(),
                new Model<Integer>(2017),
                new Model<Integer>(Calendar.FEBRUARY)
        );
        this.add(daySelectionTable);
    }
}
