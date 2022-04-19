package model.ims;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CommandProcess;

public class Forwarded2 implements CommandProcess {
    @Override
    public String requestPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.addHeader("forward2", request.getDispatcherType().name());

        return null;
    }
}
