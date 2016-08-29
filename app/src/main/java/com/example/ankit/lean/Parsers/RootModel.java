import java.util.ArrayList;

class RootModel {

	public int id;
	public String end_time;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String email;
	public String name;
	public String schedule_published_on;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String topic;
	public String organizer_name;
	public String state;
	public String logo;
	public String timezone;
	public String background_image;
	public String type;
	public String privacy;
	public String start_time;
	public String description;

	public RootModel(int id, String end_time, String code_of_conduct, ArrayList<Social_linksModel> social_links, String location_name, Call_for_papersModel call_for_papers, VersionModel version, String email, String name, String schedule_published_on, CreatorModel creator, CopyrightModel copyright, String organizer_description, String topic, String organizer_name, String state, String logo, String timezone, String background_image, String type, String privacy, String start_time, String description) {

		this.id = id;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.email = email;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.state = state;
		this.logo = logo;
		this.timezone = timezone;
		this.background_image = background_image;
		this.type = type;
		this.privacy = privacy;
		this.start_time = start_time;
		this.description = description;

	}

}