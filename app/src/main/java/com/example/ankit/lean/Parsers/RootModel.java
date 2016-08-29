import java.util.ArrayList;

class RootModel {

	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String email;
	public String location_name;
	public int id;
	public String logo;
	public CopyrightModel _copyright;
	public String end_time;
	public String code_of_conduct;
	public String organizer_name;
	public String start_time;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String topic;
	public String timezone;
	public String organizer_description;
	public String background_image;
	public CreatorModel _creator;
	public String type;
	public String schedule_published_on;
	public String privacy;

	public RootModel(String state, ArrayList<Social_linksModel> social_links, String name, String email, String location_name, int id, String logo, CopyrightModel copyright, String end_time, String code_of_conduct, String organizer_name, String start_time, String description, Call_for_papersModel call_for_papers, VersionModel version, String topic, String timezone, String organizer_description, String background_image, CreatorModel creator, String type, String schedule_published_on, String privacy) {

		this.state = state;
		this.social_links = social_links;
		this.name = name;
		this.email = email;
		this.location_name = location_name;
		this.id = id;
		this.logo = logo;
		this._copyright = copyright;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.topic = topic;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this._creator = creator;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;

	}

}