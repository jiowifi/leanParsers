import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String name;
	public String type;
	public String email;
	public String schedule_published_on;
	public String organizer_name;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String code_of_conduct;
	public String logo;
	public String description;
	public int id;
	public String timezone;
	public String background_image;
	public String state;
	public String topic;
	public String organizer_description;

	public RootModel(CreatorModel creator, String location_name, ArrayList<Social_linksModel> social_links, String start_time, String name, String type, String email, String schedule_published_on, String organizer_name, String privacy, Call_for_papersModel call_for_papers, String end_time, CopyrightModel copyright, VersionModel version, String code_of_conduct, String logo, String description, int id, String timezone, String background_image, String state, String topic, String organizer_description) {

		this._creator = creator;
		this.location_name = location_name;
		this.social_links = social_links;
		this.start_time = start_time;
		this.name = name;
		this.type = type;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this._copyright = copyright;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.description = description;
		this.id = id;
		this.timezone = timezone;
		this.background_image = background_image;
		this.state = state;
		this.topic = topic;
		this.organizer_description = organizer_description;

	}

}