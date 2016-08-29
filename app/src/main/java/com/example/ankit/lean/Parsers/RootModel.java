import java.util.ArrayList;

class RootModel {

	public String background_image;
	public int id;
	public String start_time;
	public String description;
	public String location_name;
	public String name;
	public CreatorModel _creator;
	public String end_time;
	public String timezone;
	public String code_of_conduct;
	public String logo;
	public String email;
	public String organizer_name;
	public String topic;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String type;
	public String state;
	public CopyrightModel _copyright;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String privacy;

	public RootModel(String background_image, int id, String start_time, String description, String location_name, String name, CreatorModel creator, String end_time, String timezone, String code_of_conduct, String logo, String email, String organizer_name, String topic, VersionModel version, ArrayList<Social_linksModel> social_links, String schedule_published_on, String type, String state, CopyrightModel copyright, String organizer_description, Call_for_papersModel call_for_papers, String privacy) {

		this.background_image = background_image;
		this.id = id;
		this.start_time = start_time;
		this.description = description;
		this.location_name = location_name;
		this.name = name;
		this._creator = creator;
		this.end_time = end_time;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.email = email;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this._version = version;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.state = state;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;

	}

}