import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String email;
	public String state;
	public VersionModel _version;
	public int id;
	public String privacy;
	public String end_time;
	public String logo;
	public String name;
	public String timezone;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String organizer_name;
	public String background_image;
	public String location_name;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String description;
	public String type;

	public RootModel(Call_for_papersModel call_for_papers, String email, String state, VersionModel version, int id, String privacy, String end_time, String logo, String name, String timezone, String code_of_conduct, CopyrightModel copyright, String organizer_description, String topic, ArrayList<Social_linksModel> social_links, String start_time, String organizer_name, String background_image, String location_name, CreatorModel creator, String schedule_published_on, String description, String type) {

		this._call_for_papers = call_for_papers;
		this.email = email;
		this.state = state;
		this._version = version;
		this.id = id;
		this.privacy = privacy;
		this.end_time = end_time;
		this.logo = logo;
		this.name = name;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.social_links = social_links;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.location_name = location_name;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.type = type;

	}

}