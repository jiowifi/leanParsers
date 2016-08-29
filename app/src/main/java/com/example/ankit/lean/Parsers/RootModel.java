import java.util.ArrayList;

class RootModel {

	public String email;
	public int id;
	public String background_image;
	public String schedule_published_on;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String state;
	public String timezone;
	public String type;
	public String organizer_description;
	public String logo;
	public VersionModel _version;
	public String start_time;
	public CreatorModel _creator;
	public String end_time;
	public String code_of_conduct;
	public String name;
	public String location_name;
	public String topic;
	public String privacy;

	public RootModel(String email, int id, String background_image, String schedule_published_on, String description, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String organizer_name, CopyrightModel copyright, String state, String timezone, String type, String organizer_description, String logo, VersionModel version, String start_time, CreatorModel creator, String end_time, String code_of_conduct, String name, String location_name, String topic, String privacy) {

		this.email = email;
		this.id = id;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.state = state;
		this.timezone = timezone;
		this.type = type;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this._version = version;
		this.start_time = start_time;
		this._creator = creator;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.location_name = location_name;
		this.topic = topic;
		this.privacy = privacy;

	}

}