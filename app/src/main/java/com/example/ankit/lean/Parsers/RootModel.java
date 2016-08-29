import java.util.ArrayList;

class RootModel {

	public String topic;
	public String location_name;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String start_time;
	public String organizer_name;
	public String schedule_published_on;
	public String background_image;
	public String logo;
	public String code_of_conduct;
	public String email;
	public String description;
	public int id;
	public String state;
	public CreatorModel _creator;
	public String type;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String name;
	public String timezone;
	public String privacy;

	public RootModel(String topic, String location_name, CopyrightModel copyright, VersionModel version, String start_time, String organizer_name, String schedule_published_on, String background_image, String logo, String code_of_conduct, String email, String description, int id, String state, CreatorModel creator, String type, String organizer_description, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String end_time, String name, String timezone, String privacy) {

		this.topic = topic;
		this.location_name = location_name;
		this._copyright = copyright;
		this._version = version;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.description = description;
		this.id = id;
		this.state = state;
		this._creator = creator;
		this.type = type;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.end_time = end_time;
		this.name = name;
		this.timezone = timezone;
		this.privacy = privacy;

	}

}