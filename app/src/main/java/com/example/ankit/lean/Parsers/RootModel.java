import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String description;
	public String email;
	public String name;
	public VersionModel _version;
	public String topic;
	public String code_of_conduct;
	public String background_image;
	public String schedule_published_on;
	public String privacy;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String start_time;
	public String end_time;
	public int id;
	public String organizer_name;
	public String state;
	public String type;

	public RootModel(CreatorModel creator, String description, String email, String name, VersionModel version, String topic, String code_of_conduct, String background_image, String schedule_published_on, String privacy, String location_name, ArrayList<Social_linksModel> social_links, String logo, String timezone, Call_for_papersModel call_for_papers, CopyrightModel copyright, String organizer_description, String start_time, String end_time, int id, String organizer_name, String state, String type) {

		this._creator = creator;
		this.description = description;
		this.email = email;
		this.name = name;
		this._version = version;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.location_name = location_name;
		this.social_links = social_links;
		this.logo = logo;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.end_time = end_time;
		this.id = id;
		this.organizer_name = organizer_name;
		this.state = state;
		this.type = type;

	}

}