import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public CreatorModel _creator;
	public String name;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String end_time;
	public String topic;
	public int id;
	public String state;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String description;
	public VersionModel _version;
	public String logo;
	public String type;
	public String timezone;
	public String schedule_published_on;
	public String start_time;
	public String location_name;
	public String privacy;

	public RootModel(String organizer_description, CreatorModel creator, String name, String email, Call_for_papersModel call_for_papers, CopyrightModel copyright, String code_of_conduct, String end_time, String topic, int id, String state, String organizer_name, ArrayList<Social_linksModel> social_links, String background_image, String description, VersionModel version, String logo, String type, String timezone, String schedule_published_on, String start_time, String location_name, String privacy) {

		this.organizer_description = organizer_description;
		this._creator = creator;
		this.name = name;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.topic = topic;
		this.id = id;
		this.state = state;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.background_image = background_image;
		this.description = description;
		this._version = version;
		this.logo = logo;
		this.type = type;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.location_name = location_name;
		this.privacy = privacy;

	}

}