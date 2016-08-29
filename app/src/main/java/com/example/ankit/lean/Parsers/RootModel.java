import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String organizer_name;
	public String email;
	public String topic;
	public String start_time;
	public String name;
	public VersionModel _version;
	public String logo;
	public String state;
	public String code_of_conduct;
	public String location_name;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public int id;
	public String schedule_published_on;
	public String type;
	public String description;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String privacy;

	public RootModel(String background_image, String organizer_name, String email, String topic, String start_time, String name, VersionModel version, String logo, String state, String code_of_conduct, String location_name, CopyrightModel copyright, CreatorModel creator, int id, String schedule_published_on, String type, String description, String organizer_description, ArrayList<Social_linksModel> social_links, String end_time, String timezone, Call_for_papersModel call_for_papers, String privacy) {

		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.email = email;
		this.topic = topic;
		this.start_time = start_time;
		this.name = name;
		this._version = version;
		this.logo = logo;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._copyright = copyright;
		this._creator = creator;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.description = description;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.end_time = end_time;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;

	}

}