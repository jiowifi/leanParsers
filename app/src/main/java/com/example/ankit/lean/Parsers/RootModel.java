import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String code_of_conduct;
	public String state;
	public VersionModel _version;
	public CreatorModel _creator;
	public String email;
	public String description;
	public String end_time;
	public String start_time;
	public String type;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String organizer_description;
	public int id;
	public CopyrightModel _copyright;
	public String background_image;
	public String topic;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String organizer_name;
	public String privacy;

	public RootModel(String schedule_published_on, String code_of_conduct, String state, VersionModel version, CreatorModel creator, String email, String description, String end_time, String start_time, String type, String name, ArrayList<Social_linksModel> social_links, String timezone, String organizer_description, int id, CopyrightModel copyright, String background_image, String topic, String location_name, Call_for_papersModel call_for_papers, String logo, String organizer_name, String privacy) {

		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._version = version;
		this._creator = creator;
		this.email = email;
		this.description = description;
		this.end_time = end_time;
		this.start_time = start_time;
		this.type = type;
		this.name = name;
		this.social_links = social_links;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.id = id;
		this._copyright = copyright;
		this.background_image = background_image;
		this.topic = topic;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.privacy = privacy;

	}

}