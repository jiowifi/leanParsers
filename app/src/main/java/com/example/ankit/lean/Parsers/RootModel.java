import java.util.ArrayList;

class RootModel {

	public String email;
	public String type;
	public String background_image;
	public String organizer_description;
	public String timezone;
	public VersionModel _version;
	public String name;
	public String end_time;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String logo;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String code_of_conduct;
	public String topic;
	public String location_name;
	public String description;
	public String organizer_name;
	public String start_time;
	public String privacy;

	public RootModel(String email, String type, String background_image, String organizer_description, String timezone, VersionModel version, String name, String end_time, CopyrightModel copyright, CreatorModel creator, String logo, String schedule_published_on, Call_for_papersModel call_for_papers, int id, ArrayList<Social_linksModel> social_links, String state, String code_of_conduct, String topic, String location_name, String description, String organizer_name, String start_time, String privacy) {

		this.email = email;
		this.type = type;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this._version = version;
		this.name = name;
		this.end_time = end_time;
		this._copyright = copyright;
		this._creator = creator;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.social_links = social_links;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.location_name = location_name;
		this.description = description;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.privacy = privacy;

	}

}