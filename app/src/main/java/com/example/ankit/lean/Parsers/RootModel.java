import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String background_image;
	public String location_name;
	public String state;
	public String email;
	public String organizer_name;
	public String privacy;
	public int id;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String end_time;
	public String logo;
	public String start_time;
	public String name;
	public String timezone;
	public String schedule_published_on;
	public String type;
	public String organizer_description;

	public RootModel(VersionModel version, Call_for_papersModel call_for_papers, CopyrightModel copyright, CreatorModel creator, String code_of_conduct, String background_image, String location_name, String state, String email, String organizer_name, String privacy, int id, String description, ArrayList<Social_linksModel> social_links, String topic, String end_time, String logo, String start_time, String name, String timezone, String schedule_published_on, String type, String organizer_description) {

		this._version = version;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.location_name = location_name;
		this.state = state;
		this.email = email;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.id = id;
		this.description = description;
		this.social_links = social_links;
		this.topic = topic;
		this.end_time = end_time;
		this.logo = logo;
		this.start_time = start_time;
		this.name = name;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.organizer_description = organizer_description;

	}

}