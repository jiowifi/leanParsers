import java.util.ArrayList;

class RootModel {

	public String state;
	public String schedule_published_on;
	public String name;
	public int id;
	public CreatorModel _creator;
	public VersionModel _version;
	public String topic;
	public String organizer_description;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public CopyrightModel _copyright;
	public String logo;
	public String background_image;
	public String location_name;
	public String description;
	public String timezone;
	public String email;
	public String end_time;
	public String code_of_conduct;
	public String privacy;

	public RootModel(String state, String schedule_published_on, String name, int id, CreatorModel creator, VersionModel version, String topic, String organizer_description, String organizer_name, Call_for_papersModel call_for_papers, String start_time, ArrayList<Social_linksModel> social_links, String type, CopyrightModel copyright, String logo, String background_image, String location_name, String description, String timezone, String email, String end_time, String code_of_conduct, String privacy) {

		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.id = id;
		this._creator = creator;
		this._version = version;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.social_links = social_links;
		this.type = type;
		this._copyright = copyright;
		this.logo = logo;
		this.background_image = background_image;
		this.location_name = location_name;
		this.description = description;
		this.timezone = timezone;
		this.email = email;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;

	}

}